import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CampoAddComponent } from './campo-add.component';

describe('CampoAddComponent', () => {
  let component: CampoAddComponent;
  let fixture: ComponentFixture<CampoAddComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CampoAddComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CampoAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
