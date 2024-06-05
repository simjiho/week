export const test1=function(name:string,age:number):void{
    console.log(name,age);
}
export const test2=(data:string[]):string=>{
    return data.reduce((prev:string,next:string)=>prev+next);
}