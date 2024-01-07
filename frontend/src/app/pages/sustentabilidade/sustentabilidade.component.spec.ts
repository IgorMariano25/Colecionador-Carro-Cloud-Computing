import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SustentabilidadeComponent } from './sustentabilidade.component';

describe('SustentabilidadeComponent', () => {
  let component: SustentabilidadeComponent;
  let fixture: ComponentFixture<SustentabilidadeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [SustentabilidadeComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(SustentabilidadeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
