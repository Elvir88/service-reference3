import { ITariffGroup } from '@/shared/model/tariff-group.model';

export interface ITariff {
  id?: number;
  title?: string;
  cost?: number;
  tariffGroup?: ITariffGroup | null;
}

export class Tariff implements ITariff {
  constructor(public id?: number, public title?: string, public cost?: number, public tariffGroup?: ITariffGroup | null) {}
}
