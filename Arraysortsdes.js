function Arraysortdes() {
    let fruites = ["jackfruits", "apple", "organge", "banana", "mango", "lime"];
    let res = fruites.sort();
    console.log(res);
    // console.log(fruites);
    for (let i = 0; i < fruites.length; i++) {
       
        {
            if (fruites[i] > fruites[i+1]) 
            {
                [fruites[i], fruites[i+ 1]] = [fruites[i+ 1], fruites[i]];
            } 
        }
    }
   console.log(fruites);
}

Arraysortdes();
