<template>
  <div class="row justify-content-center">
    <div class="col-8">
      <div v-if="tariffGroup">
        <h2 class="jh-entity-heading" data-cy="tariffGroupDetailsHeading">
          <span v-text="$t('serviceReference3App.tariffGroup.detail.title')">TariffGroup</span> {{ tariffGroup.id }}
        </h2>
        <dl class="row jh-entity-details">
          <dt>
            <span v-text="$t('serviceReference3App.tariffGroup.title')">Title</span>
          </dt>
          <dd>
            <span>{{ tariffGroup.title }}</span>
          </dd>
        </dl>
        <button type="submit" v-on:click.prevent="previousState()" class="btn btn-info" data-cy="entityDetailsBackButton">
          <font-awesome-icon icon="arrow-left"></font-awesome-icon>&nbsp;<span v-text="$t('entity.action.back')"> Back</span>
        </button>
        <router-link
          v-if="tariffGroup.id"
          :to="{ name: 'TariffGroupEdit', params: { tariffGroupId: tariffGroup.id } }"
          custom
          v-slot="{ navigate }"
        >
          <button @click="navigate" class="btn btn-primary">
            <font-awesome-icon icon="pencil-alt"></font-awesome-icon>&nbsp;<span v-text="$t('entity.action.edit')"> Edit</span>
          </button>
        </router-link>
      </div>
    </div>
  </div>
</template>

<script lang="ts" src="./tariff-group-details.component.ts"></script>
