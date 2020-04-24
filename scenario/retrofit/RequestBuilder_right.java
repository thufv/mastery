class RequestBuilder {
    Request build() throws UnsupportedEncodingException {
        String apiUrl = this.apiUrl;
        StringBuilder url = new StringBuilder(apiUrl);
        if (apiUrl.endsWith("/")) {
            // We require relative paths to start with '/'. Prevent a double-slash.
            url.deleteCharAt(url.length() - 1);
        }
        // Append the method relative URL.
        url.append(buildRelativeUrl());
        // Append query parameters, if needed.
        if (methodInfo.hasQueryParams) {
            boolean first = true;
            String requestQuery = methodInfo.requestQuery;
            if (requestQuery != null) {
                url.append('?').append(requestQuery);
                first = false;
            }
            String[] requestQueryName = methodInfo.requestQueryName;
            for (int i = 0; i < requestQueryName.length; i++) {
                String query = requestQueryName[i];
                if (query != null) {
                    Object arg = args[i];
                    if (arg != null) {
                        // Null values are skipped.
                        String value = URLEncoder.encode(String.valueOf(arg), "UTF-8");
                        url.append(first ? '?' : '&').append(query).append('=').append(value);
                        first = false;
                    }
                }
            }
        }
        List<retrofit.client.Header> headers = new ArrayList<retrofit.client.Header>();
        if (this.headers != null) {
            headers.addAll(this.headers);
        }
        List<Header> methodHeaders = methodInfo.headers;
        if (methodHeaders != null) {
            headers.addAll(methodHeaders);
        }
        // RFC 2616: Header names are case-insensitive.
        String[] requestParamHeader = methodInfo.requestParamHeader;
        if (requestParamHeader != null) {
            for (int i = 0; i < requestParamHeader.length; i++) {
                String name = requestParamHeader[i];
                if (name == null)
                    continue;
                Object arg = args[i];
                if (arg != null) {
                    headers.add(new retrofit.client.Header(name, String.valueOf(arg)));
                }
            }
        }
        return new Request(methodInfo.requestMethod, url.toString(), headers, buildBody());
    }
}
