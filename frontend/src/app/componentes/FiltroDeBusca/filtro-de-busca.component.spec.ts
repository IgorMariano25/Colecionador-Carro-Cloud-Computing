import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FiltroDeBuscaComponent } from './filtro-de-busca.component';

describe('FiltroDeBuscaComponent', () => {
  let component: FiltroDeBuscaComponent;
  let fixture: ComponentFixture<FiltroDeBuscaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [FiltroDeBuscaComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(FiltroDeBuscaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
