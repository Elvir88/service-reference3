<template>
  <div class="row justify-content-center">
    <div class="col-8">
      <div v-if="tariff">
        <h2 class="jh-entity-heading" data-cy="tariffDetailsHeading">
          <span v-text="$t('serviceReference3App.tariff.detail.title')">Tariff</span> {{ tariff.id }}
        </h2>
        <dl class="row jh-entity-details">
          <dt>
            <span v-text="$t('serviceReference3App.tariff.title')">Title</span>
          </dt>
          <dd>
            <span>{{ tariff.title }}</span>
          </dd>
          <dt>
            <span v-text="$t('serviceReference3App.tariff.cost')">Cost</span>
          </dt>
          <dd>
            <span>{{ tariff.cost }}</span>
          </dd>
          <dt>
            <span v-text="$t('serviceReference3App.tariff.tariffGroup')">Tariff Group</span>
          </dt>
          <dd>
            <div v-if="tariff.tariffGroup">
              <router-link :to="{ name: 'TariffGroupView', params: { tariffGroupId: tariff.tariffGroup.id } }">{{
                tariff.tariffGroup.id
              }}</router-link>
            </div>
          </dd>
        </dl>
        <button type="submit" v-on:click.prevent="previousState()" class="btn btn-info" data-cy="entityDetailsBackButton">
          <font-awesome-icon icon="arrow-left"></font-awesome-icon>&nbsp;<span v-text="$t('entity.action.back')"> Back</span>
        </button>
        <router-link v-if="tariff.id" :to="{ name: 'TariffEdit', params: { tariffId: tariff.id } }" custom v-slot="{ navigate }">
          <button @click="navigate" class="btn btn-primary">
            <font-awesome-icon icon="pencil-alt"></font-awesome-icon>&nbsp;<span v-text="$t('entity.action.edit')"> Edit</span>
          </button>
        </router-link>
      </div>
    </div>
  </div>
</template>

<script lang="ts" src="./tariff-details.component.ts"></script>
