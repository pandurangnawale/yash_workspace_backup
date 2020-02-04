
//var issues = ['issue-1','issue-2','issue-3'];

// function addIssue(issue){
//     issues.push(issue);
//     displayIssues();
// }

// function displayIssues(){
//     console.log("My Issues : ",issues);
// }

// function changeIssue(index,newIssue){
//     issues[index]=newIssue;
// }

// function deleteIssue(index){
//     issues.splice(index,1);
// }

var issueList={
   // issues : ['issue-1','issue-2','issue-3'],
   issues : [],

     displayIssues:function (){
         if(this.issues.length>0){
             var issueWithCompletedStatus='';
            console.log("My Issues : ");
            for(var i=0;i<this.issues.length;i++){
                var issue=this.issues[i];
                if(issue.completed===true){
                    issueWithCompletedStatus= '(X)'+issue.issueText;
                }else{
                    issueWithCompletedStatus= '()'+issue.issueText;
                }
                console.log(issueWithCompletedStatus);
            }
          }else{
              console.log("There is no issue in list ");
          }
    },
    // addIssue:function(issue){
    //     this.issues.push(issue);
    //     this.displayIssues();
    // },
    addIssue:function(issueText){
        this.issues.push({
            issueText:issueText,
            completed:false
        });
        view.displayIssues();
        this.displayIssues();
    },
    // changeIssue:function(index,newVal){
    //     this.issues[index]=newVal;
    // },
    changeIssue:function(index,newVal){
        this.issues[index].issueText=newVal;
    },
    deleteIssue:function(index){
        this.issues.splice(index,1);
    },
    toggleIssue:function(index){
       var issue= this.issues[index];
       issue.completed=!issue.completed;
       this.displayIssues();
    },
    toggleAll:function(){
        var totalIssues=this.issues.length;
        var completedIssues=0;
        for(var i=0;i<totalIssues;i++){
            if(this.issues[i].completed===true){
                completedIssues++;
            }
        }
        if(totalIssues===completedIssues){
            for(var i=0;i<totalIssues;i++){
                this.issues[i].completed=false;
            }
        }else{
             for(var i=0;i<totalIssues;i++){
                this.issues[i].completed=true;
            }
        }
    }
};

// var displayIssues=document.getElementById('displyIssue');
// displayIssues.addEventListener('click',function(){
//     issueList.displayIssues();
// });

// var toggleAll=document.getElementById('toggleAll');
// toggleAll.addEventListener('click',function(){
//     issueList.toggleAll();
// });

var handlers={
   displayIssues:function(){
        issueList.displayIssues();
        
   },
   toggleAll:function(){
      issueList.toggleAll(); 
      view.displayIssues();
   },
   addIssue:function(){
       var addIssueText=document.getElementById('addIssueText');
       issueList.addIssue(addIssueText.value);
       addIssueText='';
       view.displayIssues();
   },
   changeIssue:function(){
       var index=document.getElementById('changeIssueUsingPos');
       var newIssue=document.getElementById('changeIssueText');
       issueList.changeIssue(index.valueAsNumber,newIssue.value);
       view.displayIssues();
   },
//    deleteIssue:function(){
//        var index=document.getElementById('deleteIssueText');
//        issueList.deleteIssue(index.valueAsNumber,1)
//        view.displayIssues();
//    },
    deleteIssue:function(index){
       issueList.deleteIssue(index,1)
       view.displayIssues();
   },
   toggleIssue:function(){
       var index=document.getElementById('toggleIssueText');
       issueList.toggleIssue(index.valueAsNumber);
       view.displayIssues();
   }
};

var view={
    displayIssues:function(){
        var issueUl=document.querySelector('ul');
        // 
        // for(var i=0;i<issueList.issues;i++){
        // var issueLi=document.createElement('li');
        // issueUl.appendChild(issueLi);
        // }
         
        // var issueLi=document.createElement('li');
        // issueUl.appendChild(issueLi);
        
        issueUl.innerHTML='';
         for(var i=0;i<issueList.issues.length;i++){
            var issueLi=document.createElement('li');
            var issue=issueList.issues[i];
            var issueTextWithStatus='';
            if(issue.completed===true){
                issueTextWithStatus='(X)'+issue.issueText;
            }else{
                 issueTextWithStatus='()'+issue.issueText;
            }
            issueLi.id=i;
            //issueLi.textContent=issueList.issues[i].issueText;
            issueLi.textContent=issueTextWithStatus;
            issueLi.appendChild(this.createDeleteButton());
            issueUl.appendChild(issueLi);
         }
    },
    createDeleteButton:function(){
        var deleteButton;
        deleteButton=document.createElement('button');
        deleteButton.textContent='Delete';
        deleteButton.className='deleteIssue btn btn-success';
        deleteButton.style='margin-left: 180px';
       // deleteButton.className='btn btn-success'
        return deleteButton;
    },
    setupEventListner:function(){
            var issueUl = document.querySelector('ul');
            issueUl.addEventListener('click',function(){
            var elementClicked = event.target;
            if(elementClicked.className=='deleteIssue btn btn-success'){
            handlers.deleteIssue(parseInt(elementClicked.parentNode.id));
        }
    });

    }
};


view.setupEventListner();

//var issueUl = document.querySelector('ul');
//ssueUl.addEventListener('click',function(){
    //console.log("event trigger");
    //console.log(event.target);
 //   console.log(event.target.parentNode.id);
//});


// var issueUl = document.querySelector('ul');
// issueUl.addEventListener('click',function(){
//     var elementClicked = event.target;
//     if(elementClicked.className=='deleteIssue btn btn-success'){
//         handlers.deleteIssue(parseInt(elementClicked.parentNode.id));
//     }
//     console.log(event.target.parentNode.id);
// });




