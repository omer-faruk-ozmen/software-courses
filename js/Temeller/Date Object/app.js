let value;

const now = new Date(); //Şuanki zamanı alır

console.log(now)

const date1 = new Date("9-19-1990 06:15:00");

const date2 = new Date("September 19 1999");

const date3 = new Date("9/19/1999");

value = date1;

value = date1.getMonth();
value = date1.getDate();
value = date1.getDay();
value = date1.getHours();

date1.setMonth(7);
date1.setDate(15);
date1.setFullYear(1998);
date1.setHours(0)

value = date1;



console.log(value)