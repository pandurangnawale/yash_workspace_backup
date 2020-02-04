import { compute } from "./compute";

describe('Should return zero input is negetive' , ()=>{
    it('Number should have greatewr than 0', ()=>{
        const result  = compute(-1);
        expect(result).toBe(0)
    })



it('increement input',()=>{
    const result = compute(1);
    expect(result).toBe(2);
})

});