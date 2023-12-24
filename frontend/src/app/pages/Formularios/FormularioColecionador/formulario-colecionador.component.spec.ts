import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormularioColecionadorComponent } from './formulario-colecionador.component';

describe('FormularioColecionadorComponent', () => {
  let component: FormularioColecionadorComponent;
  let fixture: ComponentFixture<FormularioColecionadorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [FormularioColecionadorComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FormularioColecionadorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
