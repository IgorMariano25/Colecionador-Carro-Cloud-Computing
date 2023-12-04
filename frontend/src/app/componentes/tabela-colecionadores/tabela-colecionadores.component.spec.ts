import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TabelaColecionadoresComponent } from './tabela-colecionadores.component';

describe('TabelaColecionadoresComponent', () => {
  let component: TabelaColecionadoresComponent;
  let fixture: ComponentFixture<TabelaColecionadoresComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [TabelaColecionadoresComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TabelaColecionadoresComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
