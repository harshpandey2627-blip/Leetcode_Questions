var TimeLimitedCache = function() {
    this.cache = new Map();
};

TimeLimitedCache.prototype.set = function(key, value, duration) {
    const exists = this.cache.has(key);
    
    if (exists) {
        clearTimeout(this.cache.get(key).timer);
    }
    
    const timer = setTimeout(() => {
        this.cache.delete(key);
    }, duration);
    
    this.cache.set(key, { value, timer });
    return exists;
};

TimeLimitedCache.prototype.get = function(key) {
    return this.cache.has(key) ? this.cache.get(key).value : -1;
};

TimeLimitedCache.prototype.count = function() {
    return this.cache.size;
};