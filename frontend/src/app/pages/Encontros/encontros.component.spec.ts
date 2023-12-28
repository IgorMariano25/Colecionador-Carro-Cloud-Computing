import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EncontrosComponent } from './encontros.component';

describe('EncontrosComponent', () => {
  let component: EncontrosComponent;
  let fixture: ComponentFixture<EncontrosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [EncontrosComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(EncontrosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
