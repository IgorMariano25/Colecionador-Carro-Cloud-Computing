export class Formularios {
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
  public validarFomrulario(): boolean {
    return false
  }
}
