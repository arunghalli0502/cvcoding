function Arraysortdes() {
    let fruites = ["jackfruits", "apple", "organge", "banana", "mango", "lime"];
    for (let i = 0; i < fruites.length; i++) {
       
        {
            if (fruites[i] > fruites[i+1]) 
            {
                [fruites[i], fruites[i+ 1]] = [fruites[i+ 1], fruites[i]];
            } 
        }
    }
   console.log("After shorting : "+fruites);
}

Arraysortdes();
