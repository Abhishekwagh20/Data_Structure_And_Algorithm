function pat ( n){
    let str = "";
    let sp = n -2;
    for(let i = 1; i <= n ; i++){
     
      if(i === 1 || i === n){
        for(let j = 1; j <= n; j++){
          str += "*";
        }
      } else {
        str +="*";
        for(let j = 1; j <= sp; j++){
          str += " ";
        }
        str += "*";
      }
      str += "\n";
    }
    return str;
  }
  console.log(pat(5))
  
  /*
  
  *****
  *   *
  *   *
  *   *
  *****
  
  */