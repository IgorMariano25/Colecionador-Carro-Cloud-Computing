import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormularioCarroComponent } from './formulario-carro.component';

describe('FormularioCarroComponent', () => {
  let component: FormularioCarroComponent;
  let fixture: ComponentFixture<FormularioCarroComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [FormularioCarroComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(FormularioCarroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
