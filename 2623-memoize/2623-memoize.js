/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
    const harsh = {};
    return function(...args) {
        const sameer = JSON.stringify(args);
        if(harsh[sameer]!== undefined){
            return harsh[sameer];
        }
        const laudi = fn(...args);
        harsh[sameer]=laudi;
        return laudi;
    };
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */