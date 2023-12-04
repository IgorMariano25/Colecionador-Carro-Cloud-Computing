import { TestBed } from '@angular/core/testing';

import { ColecionadorService } from './colecionador.service';

describe('ColecionadorService', () => {
  let service: ColecionadorService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ColecionadorService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
