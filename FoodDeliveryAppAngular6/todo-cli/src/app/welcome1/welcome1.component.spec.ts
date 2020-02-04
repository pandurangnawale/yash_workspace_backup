import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Welcome1Component } from './welcome1.component';

describe('Welcome1Component', () => {
  let component: Welcome1Component;
  let fixture: ComponentFixture<Welcome1Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Welcome1Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Welcome1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
