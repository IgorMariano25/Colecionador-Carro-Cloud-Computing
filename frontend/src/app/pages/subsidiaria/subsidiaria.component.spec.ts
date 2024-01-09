import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SubsidiariaComponent } from './subsidiaria.component';

describe('SubsidiariaComponent', () => {
  let component: SubsidiariaComponent;
  let fixture: ComponentFixture<SubsidiariaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [SubsidiariaComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(SubsidiariaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
