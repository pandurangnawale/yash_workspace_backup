import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NgmodelTestComponent } from './ngmodel-test.component';

describe('NgmodelTestComponent', () => {
  let component: NgmodelTestComponent;
  let fixture: ComponentFixture<NgmodelTestComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NgmodelTestComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NgmodelTestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
