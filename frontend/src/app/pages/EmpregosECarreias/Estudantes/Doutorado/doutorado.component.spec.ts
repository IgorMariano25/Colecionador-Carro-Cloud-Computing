import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DoutoradoComponent } from './doutorado.component';

describe('DoutoradoComponent', () => {
  let component: DoutoradoComponent;
  let fixture: ComponentFixture<DoutoradoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [DoutoradoComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(DoutoradoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
