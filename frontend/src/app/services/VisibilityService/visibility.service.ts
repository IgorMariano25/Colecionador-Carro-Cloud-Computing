import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class VisibilityService {
  private showFooter = true;

  setShowFooter(show: boolean) {
    this.showFooter = show;
  }

  getShowFooter() {
    return this.showFooter;
  }
}
