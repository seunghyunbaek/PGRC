package best.hyun.pgrc.type.kaki

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Kuku : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_kuku)
    override val type: PET_TYPE
        get() = PET_TYPE.KAKI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_kuku)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
    override val subElemental: ELEMENTAL?
        get() = null
    override val mainElementalValue: Int
        get() = 100
    override val subElementalValue: Int
        get() = 0
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 40
    override val initLvMaxAtk: Int
        get() = 9
    override val initLvMaxDef: Int
        get() = 5
    override val initLvMaxSpd: Int
        get() = 8
    override val maxLvMaxHp: Int
        get() = 1325
    override val maxLvMaxAtk: Int
        get() = 304
    override val maxLvMaxDef: Int
        get() = 169
    override val maxLvMaxSpd: Int
        get() = 276
    override val initLvMinHp: Int
        get() = 31
    override val initLvMinAtk: Int
        get() = 7
    override val initLvMinDef: Int
        get() = 3
    override val initLvMinSpd: Int
        get() = 7
    override val maxLvMinHp: Int
        get() = 1116
    override val maxLvMinAtk: Int
        get() = 266
    override val maxLvMinDef: Int
        get() = 131
    override val maxLvMinSpd: Int
        get() = 245
    override val minAllGrowth: Double
        get() = 4.537
    override val maxAllGrowth: Double
        get() = 5.244
}