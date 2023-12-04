import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CarrosColecionadorComponent } from './carros-colecionador.component';

describe('CarrosColecionadorComponent', () => {
  let component: CarrosColecionadorComponent;
  let fixture: ComponentFixture<CarrosColecionadorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CarrosColecionadorComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(CarrosColecionadorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
