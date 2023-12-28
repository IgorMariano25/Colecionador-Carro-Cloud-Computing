import { Component, Input } from '@angular/core';

@Component({
  selector: 'searchFilter',
  templateUrl: './filtro-de-busca.component.html',
  styleUrl: './filtro-de-busca.component.css'
})
export class FiltroDeBuscaComponent {
  @Input() placeholder: string = ''
}
