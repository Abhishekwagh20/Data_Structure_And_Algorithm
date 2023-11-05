function pat (n){
    let sp = n  - 1;
    let st = 1;
    let str = "";
    for(let i = 1; i <= n; i++){
      for(let j = 1; j <= sp ; j++){
        str +=  " ";
      }
      for(let j = 1; j <= st ; j++){
        str +=  "*";
      }
      str += "\n";
      sp--;
      st += 2;
    }
    return str;
  }
  console.log(pat(7));

//   *
//  ***
// *****