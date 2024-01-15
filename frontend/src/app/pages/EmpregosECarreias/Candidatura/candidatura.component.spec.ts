import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CandidaturaComponent } from './candidatura.component';

describe('CandidaturaComponent', () => {
  let component: CandidaturaComponent;
  let fixture: ComponentFixture<CandidaturaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CandidaturaComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(CandidaturaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
