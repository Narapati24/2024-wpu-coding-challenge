// 2024 WPU challange
// Day 4
// 

// function smash (words) {
//   var result = "";
//   for(var i = 0; i < words.length; i++){
//     result += words[i];
//     if(i < words.length -1){
//       result += " ";
//     }
//   }
//   return result;
// };

const smash = words => words.join(" ")

console.log(smash(["hello", "world",]))