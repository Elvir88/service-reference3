<template>
  <div class="row justify-content-center">
    <div class="col-8">
      <div v-if="service">
        <h2 class="jh-entity-heading" data-cy="serviceDetailsHeading">
          <span v-text="$t('serviceReference3App.service.detail.title')">Service</span> {{ service.id }}
        </h2>
        <dl class="row jh-entity-details">
          <dt>
            <span v-text="$t('serviceReference3App.service.serviceId')">Service Id</span>
          </dt>
          <dd>
            <span>{{ service.serviceId }}</span>
          </dd>
          <dt>
            <span v-text="$t('serviceReference3App.service.title')">Title</span>
          </dt>
          <dd>
            <span>{{ service.title }}</span>
          </dd>
          <dt>
            <span v-text="$t('serviceReference3App.service.service')">Service</span>
          </dt>
          <dd>
            <div v-if="service.service">
              <router-link :to="{ name: 'ServiceView', params: { serviceId: service.service.id } }">{{
                service.service.title
              }}</router-link>
            </div>
          </dd>
        </dl>
        <button type="submit" v-on:click.prevent="previousState()" class="btn btn-info" data-cy="entityDetailsBackButton">
          <font-awesome-icon icon="arrow-left"></font-awesome-icon>&nbsp;<span v-text="$t('entity.action.back')"> Back</span>
        </button>
        <router-link v-if="service.id" :to="{ name: 'ServiceEdit', params: { serviceId: service.id } }" custom v-slot="{ navigate }">
          <button @click="navigate" class="btn btn-primary">
            <font-awesome-icon icon="pencil-alt"></font-awesome-icon>&nbsp;<span v-text="$t('entity.action.edit')"> Edit</span>
          </button>
        </router-link>
      </div>
    </div>
  </div>
</template>

<script lang="ts" src="./service-details.component.ts"></script>
