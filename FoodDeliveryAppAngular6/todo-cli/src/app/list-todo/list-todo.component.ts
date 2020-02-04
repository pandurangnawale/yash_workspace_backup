import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';


export class todoClass{
  constructor(
    public id:number,
    public description : String ,
    public status: boolean,
    public targetDate : Date){  }
}

@Component({
  selector: 'app-list-todo',
  templateUrl: './list-todo.component.html',
  styleUrls: ['./list-todo.component.css']
})
export class ListTodoComponent implements OnInit {

// todo={
//   id:1,
//   name:'Pandu'
// }

// todos=[
//   {id: 1, name: 'Pandurang' },
//   {id: 2, name: 'Poonam'},
//   {id: 3, name: 'Rahul'},
//   {id: 4, name: 'Sujata'},
//   {id: 5, name: 'Santosh'},
//   {id: 6, name: 'Searching...'}
// ]

todos=[
    new todoClass(1,'Software',false, new Date()),
    new todoClass(2,'Hardware',false, new Date()),
    new todoClass(3,'HR',false, new Date())
]
constructor(private router:ActivatedRoute) { }
  //constructor() { }

  ngOnInit() {
  }

}
