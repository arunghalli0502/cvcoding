let str = "hi hello how are you";
reverschar(str);


function reverschar(sentence)
{
    const words= sentence.split(' ');
    console.log(words);
    const reversedwords= words.map((word)=>{return word.split('').reverse().join('')})
    const reversedsentence = reversedwords.join(' ');
    console.log(reversedsentence);  
}