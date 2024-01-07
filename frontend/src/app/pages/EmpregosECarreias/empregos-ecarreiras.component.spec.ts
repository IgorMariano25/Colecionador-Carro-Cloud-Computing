import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmpregosECarreirasComponent } from './empregos-ecarreiras.component';

describe('EmpregosECarreirasComponent', () => {
  let component: EmpregosECarreirasComponent;
  let fixture: ComponentFixture<EmpregosECarreirasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [EmpregosECarreirasComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(EmpregosECarreirasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
