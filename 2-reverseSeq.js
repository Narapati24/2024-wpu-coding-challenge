// 2024 WPU challange
// Day2
// https://www.codewars.com/kata/5a00e05cc374cb34d100000d/javascript

// const reverseSeq = n => {
//   const result = [];
//   for(let i = n; i>=1;i--){
//     result.push(i);
//   }
//   return result;
// };

const reverseSeq = n => Array(n).fill().map((el, i) => i + 1).reverse();

console.log(reverseSeq(5))