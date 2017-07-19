const reverseParentheses = (str) => str.includes('(') ? reverseParentheses(firstReverse(str)) : str
const reverse = (str) => str.split('').reverse().join('')

function firstReverse(str){
    var regularExp = /\(([^()]*)\)/i;
    var subStr = regularExp.exec(str)[1];
    subStr = reverse(subStr);
    return str.replace(regularExp, subStr)
}