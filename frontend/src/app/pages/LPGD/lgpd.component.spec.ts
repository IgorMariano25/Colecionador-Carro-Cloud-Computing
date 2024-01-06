import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LgpdComponent } from './lgpd.component';

describe('LgpdComponent', () => {
  let component: LgpdComponent;
  let fixture: ComponentFixture<LgpdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [LgpdComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(LgpdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
