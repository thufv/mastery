public class GlideBuilder {
    Glide createGlide() {
        if (bitmapPool == null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
                int size = memorySizeCalculator.getBitmapPoolSize();
                if (DecodeFormat.REQUIRE_ARGB_8888) {
                    bitmapPool = new LruBitmapPool(size, Collections.singleton(Bitmap.Config.ARGB_8888));
                } else {
                    bitmapPool = new LruBitmapPool(size);
                }
            } else {
                bitmapPool = new BitmapPoolAdapter();
            }
        }
        if (byteArrayPool == null) {
            byteArrayPool = new LruByteArrayPool();
        }
        if (memoryCache == null) {
            memoryCache = new LruResourceCache(memorySizeCalculator.getMemoryCacheSize());
        }
        if (diskCacheFactory == null) {
            diskCacheFactory = new InternalCacheDiskCacheFactory(context, Glide.DEFAULT_DISK_CACHE_SIZE);
        }
    }
}