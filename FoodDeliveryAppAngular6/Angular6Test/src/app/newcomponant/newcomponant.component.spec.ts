import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NewcomponantComponent } from './newcomponant.component';

describe('NewcomponantComponent', () => {
  let component: NewcomponantComponent;
  let fixture: ComponentFixture<NewcomponantComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewcomponantComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewcomponantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
