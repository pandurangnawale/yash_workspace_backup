import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplySelectComponent } from './disply-select.component';

describe('DisplySelectComponent', () => {
  let component: DisplySelectComponent;
  let fixture: ComponentFixture<DisplySelectComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DisplySelectComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DisplySelectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
