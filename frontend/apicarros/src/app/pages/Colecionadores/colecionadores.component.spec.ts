import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ColecionadoresComponent } from './colecionadores.component';

describe('ColecionadoresComponent', () => {
  let component: ColecionadoresComponent;
  let fixture: ComponentFixture<ColecionadoresComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ColecionadoresComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ColecionadoresComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
