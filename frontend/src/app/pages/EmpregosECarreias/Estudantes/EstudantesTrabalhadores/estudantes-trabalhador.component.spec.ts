import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EstudantesTrabalhadorComponent } from './estudantes-trabalhador.component';

describe('EstudantesTrabalhadorComponent', () => {
  let component: EstudantesTrabalhadorComponent;
  let fixture: ComponentFixture<EstudantesTrabalhadorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [EstudantesTrabalhadorComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(EstudantesTrabalhadorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
