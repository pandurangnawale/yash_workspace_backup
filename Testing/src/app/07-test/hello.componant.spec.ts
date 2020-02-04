//describe()  //suite of similiar type of class

//it()  // spec or test

let expected ='';
let notexpected ='';

beforeEach(()=>{
    expected='hello';
    notexpected='hello1'
})

afterAll(()=>{
    expected='';
    notexpected=''
})


describe('hello', ()=>{
    it('my hello sould hello', ()=>{
        expect('hello').toBe('hello')
    })



it('my hello not should no be hello',()=>{
    expect(expected).not.toBe(notexpected);
})

});