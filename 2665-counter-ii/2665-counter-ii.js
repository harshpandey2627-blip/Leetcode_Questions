/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
   let harsh = init;
   return{
    increment:()=>++harsh,
    decrement:()=>--harsh,
    reset:()=>harsh=init,
   }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */