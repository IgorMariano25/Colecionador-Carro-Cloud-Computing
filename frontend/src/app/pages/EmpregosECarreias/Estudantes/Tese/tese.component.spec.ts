import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TeseComponent } from './tese.component';

describe('TeseComponent', () => {
  let component: TeseComponent;
  let fixture: ComponentFixture<TeseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [TeseComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(TeseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
