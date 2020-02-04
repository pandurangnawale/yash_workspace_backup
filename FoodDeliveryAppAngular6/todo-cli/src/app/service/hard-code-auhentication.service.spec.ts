import { TestBed } from '@angular/core/testing';

import { HardCodeAuhenticationService } from './hard-code-auhentication.service';

describe('HardCodeAuhenticationService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: HardCodeAuhenticationService = TestBed.get(HardCodeAuhenticationService);
    expect(service).toBeTruthy();
  });
});
