let str = "hi hello how are you";
reverschars(str);


// function reverschar(sentence)
// {
//     const words= sentence.split(' ');
//     console.log(words);
//     const reversedwords= words.map((word)=>{return word.split('').reverse().join('')})
//     const reversedsentence = reversedwords.join(' ');
//     console.log(reversedsentence);  
// }

function reverschars(sentence)
{
    sentence=sentence+" ";
    let words =[];
    let start=0;
    for(let l=0; l<sentence.length; l++)
    {
        if(sentence.charAt(l)==' ')
        {
            words.push(sentence.slice(start, l));
            start=l+1;
        }
    }
    for(let i=0; i<words.length; i++)
    {
        let reversedword='';
        var word= words[i];
        for (let j =word.length; j>=0; j--)
        {
            let x= word.charAt(j);
            reversedword= reversedword+x;
        }
        words[i]=reversedword;
    }
    let reversedsentence='';
    for (let k = 0; k < words.length; k++) 
    {
        reversedsentence= reversedsentence+ words[k]+" ";
    }
    reversedsentence=reversedsentence.trimEnd(" ");
    console.log("Reversed sentence : "+ reversedsentence);
}
