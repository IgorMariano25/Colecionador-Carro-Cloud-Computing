import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TemosUsoComponent } from './temos-uso.component';

describe('TemosUsoComponent', () => {
  let component: TemosUsoComponent;
  let fixture: ComponentFixture<TemosUsoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [TemosUsoComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(TemosUsoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
