import { Component, OnInit } from '@angular/core';
import { Product } from '../_model/product.model';

@Component({
  selector: 'app-add-new-product',
  templateUrl: './add-new-product.component.html',
  styleUrls: ['./add-new-product.component.scss'],
})
export class AddNewProductComponent implements OnInit {
  product: Product = {
    productName: '',
    productDescription : '',
    productDiscountedPrice : 0,
    productActualPrice:0
  };
  constructor() {}

  ngOnInit(): void {}
}
