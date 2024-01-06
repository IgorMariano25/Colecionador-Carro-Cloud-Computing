import { Component } from '@angular/core';

@Component({
  selector: 'app-formulario-contato',
  templateUrl: './formulario-contato.component.html',
  styleUrl: './formulario-contato.component.css'
})
export class FormularioContatoComponent {
  public openPopUp() {
    let popup = document.querySelector(".popup");
    popup?.classList.add("open__popup");

    let popupBackgroundView = document.querySelector(".popup__view");
    popupBackgroundView?.classList.add("active");
  }

  public closePopUp() {
    let popup = document.querySelector(".popup");
    let popupBackgroundView = document.querySelector(".popup__view");
    popup?.classList.remove("open__popup");
    popupBackgroundView?.classList.remove("active");
  }
}
