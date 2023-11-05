function pat (n){
    let str = "";
    for(let i = 1; i <= n ; i++){
      for(let j = 1 ; j <= i*2; j++){
        str += "*";
      }
      str += "\n"
    }
    
    return str;
  }
  console.log(pat(3));
  
//   **
//   ****
//   ******