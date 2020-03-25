public class IntelliMerge {
    public void saveAll(Path root) {
        for(Map.Entry<Path, ParseResult<CompilationUnit>>
            cu:content.entrySet()) {
            final Path path=root.resolve(cu.getKey());
            final String code=new PrettyPrinter()
                .print(cu.getValue().getResult().get());
            try(PrintWriter out=
                new PrintWriter(path.toFile(),StandardCharsets.UTF_8)){
                out.println(code);
            }
        }
    }
}